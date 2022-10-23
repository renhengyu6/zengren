package com.zengren.music.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zengren.music.entity.Musiclink;
import com.zengren.music.mapper.MusiclinkMapper;
import com.zengren.music.service.MusiclinkService;
import org.springframework.stereotype.Service;

/**
 * (Musiclink)表服务实现类
 *
 * @author makejava
 * @since 2022-10-20 22:42:10
 */
@Service("musiclinkService")
public class MusiclinkServiceImpl extends ServiceImpl<MusiclinkMapper, Musiclink> implements MusiclinkService {

}

