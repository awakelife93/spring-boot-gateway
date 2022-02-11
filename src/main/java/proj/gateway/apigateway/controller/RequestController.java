package proj.gateway.apigateway.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import proj.gateway.apigateway.service.RequestService;

@Controller("requestController")
public class RequestController {

  @Resource(name = "requestService")
  RequestService requestService;

  public HashMap<String, Object> get(HttpServletRequest req) throws Exception {
    return requestService.get(req);
  }

  public HashMap<String, Object> delete(HttpServletRequest req) throws Exception {
    return requestService.delete(req);
  }

  public HashMap<String, Object> post(HttpServletRequest req, Map<String, Object> body) throws Exception {
    return requestService.post(req, body);
  }

  public HashMap<String, Object> put(HttpServletRequest req, Map<String, Object> body) throws Exception {
    return requestService.put(req, body);
  }

  public HashMap<String, Object> patch(HttpServletRequest req, Map<String, Object> body) throws Exception {
    return requestService.patch(req, body);
  }
}
