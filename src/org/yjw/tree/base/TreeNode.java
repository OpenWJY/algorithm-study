package org.yjw.tree.base;

/**
 * @author yjw
 * @date 2022/6/8
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public Integer value;

    public TreeNode(Integer value) {
        this.value = value;
    }

    public TreeNode(TreeNode left, TreeNode right, Integer value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
}
