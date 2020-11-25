/*
 * package com.cc.accelerator.controller;
 * 
 * import javax.validation.Valid;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.cc.accelerator.dto.GenericResponse; import
 * com.cc.accelerator.dto.ViewReqDto; import
 * com.cc.accelerator.service.MongoService;
 * 
 * @RequestMapping("/mongo")
 * 
 * @RestController public class MongoDemoController { private final MongoService
 * mongoService;
 * 
 * @Autowired public MongoDemoController(MongoService mongoService) {
 * this.mongoService = mongoService; }
 * 
 * @PostMapping("/getData") public ResponseEntity<GenericResponse>
 * getData(@RequestBody @Valid ViewReqDto viewName) throws Exception { return
 * ResponseEntity.ok(mongoService.getData(viewName)); } }
 */