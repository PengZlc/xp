package com.yaao.ps10.quartz.util;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 用于获取Spring应用上下文的工具组件
 * @author user
 * @date 2017/9/25
 */
@Component
public class SpringUtil implements ApplicationContextAware, DisposableBean {
  private static ApplicationContext applicationContext = null;

  public static ApplicationContext getApplicationContext() {
    assertContextInjected();
    return applicationContext;
  }

  @SuppressWarnings("unchecked")
  public static <T> T getBean(String name) {
    assertContextInjected();
    return (T) applicationContext.getBean(name);
  }

  public static <T> T getBean(Class<T> requiredType) {
    assertContextInjected();
    return applicationContext.getBean(requiredType);
  }

  public static void clearHolder() {
    applicationContext = null;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) {
    SpringUtil.applicationContext = applicationContext;
  }

  @Override
  public void destroy() {
    SpringUtil.clearHolder();
  }

  private static void assertContextInjected() {
    if(applicationContext == null) {
      throw new IllegalStateException("error");
    }
  }
}
