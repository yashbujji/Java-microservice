/*
 * package com.cc.accelerator.service.impl;
 * 
 * import static com.cc.accelerator.util.ConvertUtil.getGenericResponse;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Map;
 * import java.util.stream.Collectors; import java.util.stream.Stream;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.data.mongodb.core.query.Criteria; import
 * org.springframework.data.mongodb.core.query.Query; import
 * org.springframework.stereotype.Service;
 * 
 * import com.cc.accelerator.config.MongoConfig; import
 * com.cc.accelerator.dto.GenericResponse; import
 * com.cc.accelerator.dto.ViewReqDto; import
 * com.cc.accelerator.repository.MongoCollectionRepository; import
 * com.cc.accelerator.service.MongoService;
 * 
 * @Service public class MongoServiceImpl implements MongoService {
 * 
 * private final MongoCollectionRepository mongoCollectionRepository;
 * 
 * @Value("${mongo.collections.name}") private String collectionNames;
 * 
 * @Autowired public MongoServiceImpl(MongoCollectionRepository
 * mongoCollectionRepository) { this.mongoCollectionRepository =
 * mongoCollectionRepository; }
 * 
 * @Autowired MongoConfig mongoconfig;
 * 
 * @Override public GenericResponse getData(ViewReqDto request) throws Exception
 * { List<String> fieldList = Stream.of(request.getViewName().split(",",
 * -1)).collect(Collectors.toList()); List<String> idList =
 * Stream.of(request.get_id().split(",", -1)).collect(Collectors.toList());
 * List<String> collectionNameList = Stream.of(collectionNames.split(",",
 * -1)).collect(Collectors.toList());
 * 
 * Query query = new Query(); if (fieldList != null && !fieldList.isEmpty()) {
 * for (String field : fieldList) { query.fields().include(field.toUpperCase());
 * } } if (!request.get_id().isEmpty()) { Criteria criteriaDefinition = new
 * Criteria().where("_id").in(idList); query.addCriteria(criteriaDefinition); }
 * if (collectionNameList.contains(request.getCollectionName())) { List<Map>
 * mongoDocuments = mongoconfig.getMongoTemplate().find(query, Map.class,
 * request.getCollectionName()); return getGenericResponse(mongoDocuments); }
 * return getGenericResponse(new ArrayList<>()); } }
 */