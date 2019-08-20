package com.text.es.controller;

import com.text.es.entity.EsUser;
import com.text.es.repository.EsUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: ZMJ
 * @Date: 2019/6/3 15:46
 * @Description:
 */
@RestController
public class EsController {
    @Autowired
    private EsUserRepository esUserRepository;
    //@RequestMapping("/esusers")
  /*  public List<EsUser> list(@RequestParam("username") String username,
                             @RequestParam(value = "pageIndex",defaultValue = "0") int pageIndex,
                             @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){
        Pageable pageable = PageRequest.of(pageIndex,pageSize);
        Page<EsUser> result = esUserRepository.findEsUsersByUsername("fanqi",pageable);
        return result.getContent();
    }*/
}
