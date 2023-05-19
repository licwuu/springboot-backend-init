package com.licw.model.dto.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author licw
 */
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long[] ids;

    public Long getId(){
        if(ids.length == 0){
            return null;
        }
        return ids[0];
    }
    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
    }

    private static final long serialVersionUID = 1L;
}