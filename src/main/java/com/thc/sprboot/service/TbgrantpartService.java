package com.thc.sprboot.service;


import com.thc.sprboot.dto.DefaultDto;
import com.thc.sprboot.dto.TbgrantpartDto;

import java.util.List;

public interface TbgrantpartService {
    TbgrantpartDto.CreateResDto toggle(TbgrantpartDto.ToggleServDto param);
    /**/
    TbgrantpartDto.CreateResDto create(TbgrantpartDto.CreateServDto param);
    TbgrantpartDto.CreateResDto update(TbgrantpartDto.UpdateServDto param);
    TbgrantpartDto.CreateResDto delete(DefaultDto.DeleteServDto param);
    TbgrantpartDto.CreateResDto deletes(DefaultDto.DeletesServDto param);
    TbgrantpartDto.DetailResDto detail(DefaultDto.DetailServDto param);
    List<TbgrantpartDto.DetailResDto> list(TbgrantpartDto.ListServDto param);
    DefaultDto.PagedListResDto pagedList(TbgrantpartDto.PagedListServDto param);
    List<TbgrantpartDto.DetailResDto> scrollList(TbgrantpartDto.ScrollListServDto param);
}
