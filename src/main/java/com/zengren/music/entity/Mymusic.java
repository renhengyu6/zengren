package com.zengren.music.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Mymusic)表实体类
 *
 * @author makejava
 * @since 2022-10-20 22:40:42
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mymusic {
    
    private Integer myId;
    
    private String mySongname;
    
    private String mySinger;
    
    private String mySonglink;
    
    private String myLyriclink;
    
    private String myPhotolink;
    
    private Integer userId;

}

