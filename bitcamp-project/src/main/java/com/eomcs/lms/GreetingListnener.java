package com.eomcs.lms;

import java.util.Map;
import com.eomcs.lms.context.ApplicationContextListener;

public class GreetingListnener implements ApplicationContextListener {

  @Override
  public void contextInitialized(Map<String, Object> context) {
    System.out.println("[수업 관리 시스템]에 오신걸 환영합니다.");
  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {
    System.out.println("안녕히 가세요.");
  }

}
