import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTests {

	@Test
	public void testMethod1Simple() {
		BST<String> tree = makeTree();
		assertFalse(tree.method1("A"));
		assertFalse(tree.method1("B"));
		assertTrue(tree.method1("C"));
		assertTrue(tree.method1("D"));
		assertTrue(tree.method1("E"));
		assertTrue(tree.method1("F"));
		assertTrue(tree.method1("G"));
		assertTrue(tree.method1("H"));
		assertFalse(tree.method1("I"));
		assertFalse(tree.method1("J"));
	}

	@Test
	public void testMethod2Simple() {
		BST<String> tree = makeTree();
		assertEquals(1, tree.method2());
	}
	
	
	/*
	 * Returns a BST that looks like this:
	 *  
	 *         F
	 *        / \ 
	 *       D   G
	 *      / \   \    
	 *     C   E   H
	 */
	private BST<String> makeTree() {
		BST<String> tree = new BST<>();
		tree.add("F");
		tree.add("D");
		tree.add("G");
		tree.add("H");
		tree.add("C");
		tree.add("E");
		return tree;
	}
}
