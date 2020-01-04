package com.ssp.subdemo.dao.mapper;

import com.ssp.subdemo.domain.CardDO;
import org.springframework.stereotype.Repository;

/**
 * Àà¹¦ÄÜÃèÊö
 *
 * @Author wudongli
 * @Date 2019/12/21 23:49
 */
@Repository
public interface CardDOMapper {

    CardDO Sel(String cardNumber);

    int insertCard(CardDO cardDO);
}
