package com.zengren.music.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Musiclink)表实体类
 *
 * @author makejava
 * @since 2022-10-20 22:42:10
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Musiclink {
    
    private Integer mlId;
    
    private String mlSongname;
    
    private String mlSinger;
    
    private String mlSonglink;
    
    private String mlLyriclink;
    
    private String mlPhotolink;

}

