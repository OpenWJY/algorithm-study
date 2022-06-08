package org.yjw.tree.base;

/**
 * @author yjw
 * @date 2022/6/8
 */
public class TreeBuilder {

    /* 构建树 */
    public static TreeNode buildTree() {
        TreeNode root = new TreeNode(5);

        TreeNode left = new TreeNode(
                new TreeNode(new TreeNode(8), new TreeNode(9), 11),
                new TreeNode(new TreeNode(6), null, 4),
                3
        );

        TreeNode right = new TreeNode(
                null,
                new TreeNode(17),
                13
        );

        root.left = left;
        root.right = right;
        return root;
    }

}
