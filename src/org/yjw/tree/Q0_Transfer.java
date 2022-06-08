package org.yjw.tree;

import org.yjw.tree.base.TreeBuilder;
import org.yjw.tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yjw
 * @date 2022/6/8
 * 树的前中后序遍历
 */
public class Q0_Transfer {
    static List<Integer> printList = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode tree = TreeBuilder.buildTree();
        preOrder(tree);
        System.out.println(printList.toString());
        printList.clear();

        inOrder(tree);
        System.out.println(printList.toString());
        printList.clear();

        backOrder(tree);
        System.out.println(printList.toString());
        printList.clear();

    }

    /**
     * 前序遍历
     *
     * @param tree
     */
    static void preOrder(TreeNode tree) {
        if (tree == null) {
            return;
        }

        Integer value = tree.value;
        printList.add(value);

        // 遍历左
        preOrder(tree.left);

        // 遍历右
        preOrder(tree.right);
    }

    /**
     * 中序遍历
     *
     * @param tree
     */
    static void inOrder(TreeNode tree) {
        if (tree == null) {
            return;
        }

        // 遍历左
        inOrder(tree.left);

        Integer value = tree.value;
        printList.add(value);

        // 遍历右
        inOrder(tree.right);
    }

    /**
     * 后序遍历
     *
     * @param tree
     */
    static void backOrder(TreeNode tree) {
        if (tree == null) {
            return;
        }

        // 遍历左
        backOrder(tree.left);

        // 遍历右
        backOrder(tree.right);

        Integer value = tree.value;
        printList.add(value);
    }
}
