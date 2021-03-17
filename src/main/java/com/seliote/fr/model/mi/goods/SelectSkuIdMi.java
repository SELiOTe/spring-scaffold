package com.seliote.fr.model.mi.goods;

import com.seliote.fr.annotation.validation.ColorId;
import com.seliote.fr.annotation.validation.GoodsId;
import com.seliote.fr.annotation.validation.SizeId;
import lombok.Data;

/**
 * 获取商品的 SKU ID MI
 *
 * @author seliote
 */
@Data
public class SelectSkuIdMi {

    // 商品 ID
    @GoodsId
    private Long goodsId;

    // 商品颜色 ID
    @ColorId
    private Long colorId;

    // 商品尺码 ID
    @SizeId
    private Long sizeId;
}
