package com.snowxk.lease.web.admin.custom.converter;

import com.snowxk.lease.model.enums.ItemType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToItemTypeConverter implements Converter<String, ItemType> {
    @Override
    public ItemType convert(String code) {

        ItemType[] values = ItemType.values();
        for (ItemType itemType : values) {
            if (itemType.getCode().equals(Integer.valueOf(code))) {
                return itemType;
            }
        }
        throw new IllegalArgumentException("code:" + code + "非法");
        //        if ("1".equals(code)) {
//            return ItemType.APARTMENT;
//        }
//        if ("2".equals(code)) {
//            return ItemType.ROOM;
//        }
    }
}
