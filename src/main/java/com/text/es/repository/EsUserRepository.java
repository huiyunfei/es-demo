package com.text.es.repository;

import com.text.es.entity.EsUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Auther: ZMJ
 * @Date: 2019/6/3 15:39
 * @Description:
 */
public interface EsUserRepository extends ElasticsearchRepository<EsUser,String> {
    //Page<Object> findEsUsersByUsername(String username, Pageable pageable);
}
