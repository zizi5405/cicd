package dev.mvc.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class CICDCont {
  public CICDCont() {
    System.out.println("-> CICDCont created.");
  }

  // http://localhost:9091/cicd?sw=-1
  // http://localhost:9091/cicd?sw=0
  // http://localhost:9091/cicd?sw=1
  @GetMapping("/cicd")
  public String cicd(@RequestParam(defaultValue = "1") Integer sw) { // defaultValue = "1" -> 1
    String msg = "";
    
    if (sw == -1) {
      msg = "/cide ȣ���, error �α�";
      log.error(msg);
    } else if (sw == 0) {
      msg = "/cide ȣ���, warn �α�";
      log.warn(msg);
    }else if (sw == 1) {
      msg = "/cicd ȣ���, info �α�";
      log.info(msg);
    }
    return "<h3>" + msg + "</h3>";
  }
}
