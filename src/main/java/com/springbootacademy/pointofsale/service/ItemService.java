package com.springbootacademy.pointofsale.service;

import com.springbootacademy.pointofsale.dto.ItemDTO;
import com.springbootacademy.pointofsale.dto.paginated.PaginatedResponseItemDTO;
import com.springbootacademy.pointofsale.dto.request.RequestItemSaveDTO;
import javassist.NotFoundException;

import java.util.List;

public interface ItemService {


    String addItem(RequestItemSaveDTO requestItemSaveDTO);

    List<ItemDTO> getItemByNameAndActiveState(String itemName) ;

    PaginatedResponseItemDTO getAllItemsActive(int page, int size, boolean activeState);
}
