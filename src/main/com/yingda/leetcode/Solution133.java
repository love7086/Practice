package main.com.yingda.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution133 {
	Map<Integer, Node> map = new HashMap();

	public static void main(String[] args) {

	}

	public Node cloneGraph(Node node) {
		Node n = new Node(node.val);
		map.put(n.val, n);
		List<Node> nodes = new LinkedList();
		for (Node tmp : node.neighbors) {
			if (map.containsKey(tmp.val)) {
				nodes.add(map.get(tmp.val));
			} else {
				nodes.add(cloneGraph(tmp));
			}
		}
		n.neighbors = nodes;
		return n;
	}

}
