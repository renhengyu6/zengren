package com.zengren.music.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zengren.music.entity.Mymusic;
import com.zengren.music.mapper.MymusicMapper;
import com.zengren.music.service.MymusicService;
import org.springframework.stereotype.Service;

/**
 * (Mymusic)表服务实现类
 *
 * @author makejava
 * @since 2022-10-20 22:40:42
 */
@Service("mymusicService")
public class MymusicServiceImpl extends ServiceImpl<MymusicMapper, Mymusic> implements MymusicService {

}

