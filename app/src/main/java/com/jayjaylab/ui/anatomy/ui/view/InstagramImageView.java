package com.jayjaylab.ui.anatomy.ui.view;

import com.jayjaylab.ui.anatomy.model.data.instagram.Node;

import java.util.List;

/**
 * Created by jjkim on 2016. 7. 17..
 */
public interface InstagramImageView {
    void showImage(Node node);
    void showImage(List<Node> list);
}
