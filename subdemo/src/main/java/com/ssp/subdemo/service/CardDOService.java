package com.ssp.subdemo.service;

import com.ssp.subdemo.dao.mapper.CardDOMapper;
import com.ssp.subdemo.domain.CardDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ¿‡π¶ƒ‹√Ë ˆ
 *
 * @Author wudongli
 * @Date 2019/12/21 23:46
 */
@Service
@MapperScan("com.ssp.subdemo.dao.mapper")
public class CardDOService {

    @Autowired
    CardDOMapper cardDOMapper;

    public CardDO Sel(String cardNumber) {
        return cardDOMapper.Sel(cardNumber);
    }

    public int insertCard(CardDO cardDO) {
       return cardDOMapper.insertCard(cardDO);
    }
}
