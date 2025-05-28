
import com.sun.source.tree.ConstantCaseLabelTree;

//KIT107 Assignment 3
/**
 *	GameTree ADT
 *
 *	@author Iola Fleming 730234 and Aleron Francois (Unknown ID)
 *	@version 28/05/2025
 *	
 *	This file holds the GameTree ADT which is a
 *	general game tree.  The GameTree is built using
 *	TNode ADTs.  A GameTree object consists of a
 *	"root" field which refers to a TNode object.
 *	
 *	YOU NEED TO MAKE CHANGES TO THIS FILE!
*/


public class GameTree implements GameTreeInterface {
	// finals
	protected final boolean TRACING = false; // do we want to see trace output?

	// properties
	protected TNode root; // the node at the top of the tree


	/**
	 *	GameTree
	 *	Constructor method 1.
	 *	Pre-condition: none
	 *	Post-condition: the GameTree object's "root" field is null
	 *	Informally: creates an empty tree
	*/
	public GameTree() {
		trace("GameTree: constructor starts");
		//ME DO
		Grid g = new Grid(); // create an empty grid
		root = new TNode(g, 0);
		
		trace("GameTree: constructor ends");
	}


	/**
	 *	GameTree
	 *	Constructor method 2.
	 *	Pre-condition: none
	 *	Post-condition: the GameTree object's "root" field refers
	 *					to a new TNode object containing the
	 *					parameter value (o) of level with
	 *					parameter value (l) with a null child,
	 *					and a null sibling
	 *	Informally: create a tree of a single node (i.e. a leaf)
	 *				with the node and level value provided on the
	 *				parameter list
	 *
	 *	@param o Object to include in TNode node's data field
	 *	@param l level number for GameTree
	*/
	public GameTree(Object o, int l) {
		trace("GameTree: constructor starts");
		
		root = new TNode(o, l);
		
		trace("GameTree: constructor ends");
	}
	
	
	/**
	 *	isEmpty
	 *	Emptiness test.
	 *	Pre-condition: none
	 *	Post-condition: true is returned if the GameTree object is
	 *					empty, false is returned otherwise
	 *	Informally: indicate if the GameTree contains no nodes
	 *
	 *	@return boolean whether or not the game tree is empty
	*/
	public boolean isEmpty() {
		trace("isEmpty: isEmpty starts and ends");
		if(root == null){
			return true;
		}
		else{
			return(root.getData() == null);
		}
	}


	/**
	 *	getData
	 *	Get method for "root" instance variable's data value.
	 *	Pre-condition: none
	 *	Post-condition: the value of the GameTree object's data
	 *					field is returned
	 *	Informally: return the value within the root node,
	 *				throw an exception if the tree is empty
	 *
	 *	@return Object the data item of the root node
	*/
	public Object getData() throws EmptyGameTreeException {
		trace("getData: getData starts");
		
		if (isEmpty()) {
			trace("getData: empty game tree");
			throw new EmptyGameTreeException();
		}
		else {
			trace("getData: getData ends");
			//ME DO
			return root.getData();
		}
	}
	
	
	/**
	 *	getLevel
	 *	Get method for "root" instance variable's level value.
	 *	Pre-condition: none
	 *	Post-condition: the value of the GameTree object's data
	 *					field's level is returned
	 *	Informally: return the level value within the root node,
	 *				throw an exception if the tree is empty
	 *
	 *	@return int the level number of the root node
	*/
	public int getLevel() throws EmptyGameTreeException {
		trace("getLevel: getLevel starts");
		
		if (isEmpty()) {
			throw new EmptyGameTreeException();
		}	
		
		trace("getLevel: getLevel ends");

		return root.getLevel();
	}	
	

	/**
	 *	getChild
	 *	Get method for "root" instance variable's child value.
	 *	Pre-condition: none
	 *	Post-condition: the value of the GameTree object's child
	 *					field is returned in a newly
	 *					constructed GameTree object
	 *	Informally: return the GameTree object's child, throw
	 *					an exception if the tree is empty
	 *
	 *	@return GameTree the eldest child of the current node
	*/
	public GameTree getChild() throws EmptyGameTreeException {
		GameTree r;
		
		trace("getChild: getChild starts");
		
		if (isEmpty()) {
			throw new EmptyGameTreeException();
		}
  
		// create a game tree to hold the answer
		r = new GameTree();
		r.root = root.getChild();

		trace("getChild: getChild ends");

		return r;
	}


	/**
	 * 	getSibling
	 *	Get method for "root" instance variable's sibling value.
	 *	Pre-condition: none
	 *	Post-condition: the value of the GameTree object's sibling
	 *					field is returned in a newly
	 *					constructed GameTree object
	 *	Informally: return the GameTree object's sibling, throw
	 *					an exception if the tree is empty
	 *
	 *	@return GameTree the next sibling of the current node
	*/
	public GameTree getSibling() throws EmptyGameTreeException {
		GameTree r;
		
		trace("getSibling: getSibling starts");
		
		if (isEmpty()) {
			trace("getSibling: empty game tree");
			throw new EmptyGameTreeException();
  		}
  		
		//ME DO
		else{
			r = new GameTree();
			r.root = root.getSibling();
		}

		trace("getSibling: getSibling ends");

		return r;
	}


	/**
	 *	setData
	 *	Set method for "root" instance variable's data field.
	 *	Pre-condition: none
	 *	Post-condition: the TNode object's data field is altered to
	 *					hold the given (o) value
	 *	Informally: store the given value in the root node of the
	 *				GameTree object, throw an exception if the tree is
	 *				empty
	 *
	 *	@param o Object to install as data for root node
	*/
	public void setData(Object o) throws EmptyGameTreeException {
		trace("setData: setData starts");
		
		if (isEmpty()) {
			trace("setData: empty game tree");
			throw new EmptyGameTreeException();
		}
		else{
			//ME DO
			root.setData(o);
		}
		
		trace("setData: setData ends");
	}
	
	
	/**
	 *	setLevel
	 *	Set method for "root" instance variable's level field.
	 *	Pre-condition: none
	 *	Post-condition: the TNode object's level field is altered
	 *					to hold the given (l) value
	 *	Informally: assign the given value as the level of the
	 *				GameTree object, throw an exception if the tree is
	 *				empty
	 *
	 *	@param l level number for root of current game tree
	*/
	public void setLevel(int l) throws EmptyGameTreeException {
		trace("setLevel: setLevel starts");
		
		if (isEmpty()) {
			trace("setLevel: empty game tree");
			throw new EmptyGameTreeException();
  		}
		else{
			//ME DO
			root.setLevel(l);
		}
		
		trace("setLevel: setLevel ends");
	}
	
	
	/**
	 *	setChild
	 *	Set method for "root" instance variable's child field.
	 *	Pre-condition: none
	 *	Post-condition: the TNode object's child field is altered
	 *					to hold the given (t) value
	 *	Informally: assign the given value as the child of the
	 *				GameTree object, throw an exception if the tree is
	 *				empty
	 *
	 *	@param t GameTree to be set as eldest child of current game tree
	*/
	public void setChild(GameTree t) throws EmptyGameTreeException {
		trace("setChild: setChild starts");
		
		if (isEmpty()) {
			trace("setChild: empty game tree");
			throw new EmptyGameTreeException();
  		}
  		
		root.setChild(t.root);
		
		trace("setChild: setChild ends");
	}
	
	
	/**
	 *	setSibling
	 *	Set method for "root" instance variable's sibling field.
	 *	Pre-condition: none
	 *	Post-condition: the TNode object's sibling field is altered
	 *					to hold the given (t) value
	 *	Informally: assign the given value as the sibling of the
	 *				GameTree object, throw an exception if the tree is
	 *				empty
	 *
	 *	@param t GameTree to be set as next sibling of current game tree
	*/
	public void setSibling(GameTree t) throws EmptyGameTreeException {
		trace("setSibling: setSibling starts");
		
		if (isEmpty()) {
			trace("setSibling: empty game tree");
			throw new EmptyGameTreeException();
		}
		else{
			//ME DO
			root.setSibling(t.root);
		}

		trace("setSibling: setSibling ends");
	}
	
	
	/**
	 *	generateLevelDF
	 *	Generate the next level of the tree
	 *	Pre-condition: the given stack is defined, and the given
	 *				   symbol is defined
	 *	Post-condition: an additional level of possible moves has
	 *					been added to the current game tree and each
	 *					tree node of the new level also has been
	 *					pushed onto the stack.
	 *	Informally: generate the next level of the game tree
	 *
	 *	@param s Stack of reachable but unexpanded game trees
	 *	@param m queen symbol to add to the level
	*/
	public void generateLevelDF(Stack s, Symbol m) {
		final int MINIMUM = 1; 			 // Minimum row and column number
		GameTree firstChild = null; 	 // Set the first child to null initially
		GameTree prevChild = null; 		 // Set the previous child to null initially
		int v = getLevel(); 			 // Get the current level
		Grid b1 = (Grid) root.getData(); // Get the current board
		int d = b1.getDimension(); 		 // Get the dimension of the board
		int column; 					 // Iterates through columns 

		// Place a queen every new row
		int row = v + 1;
		if (row > d) {
			return;
		}

		/* 
			Loop through all columns in the current row.
			Check if the row and column are empty for placing a queen.
		*/
		for (column = MINIMUM; column <= d; column++) {
			Location l = new Location(row, column); // Create a new location for the queen

			// Check if the location is empty for placing a queen
			if (b1.rowClear(l) && b1.columnClear(l) && b1.diagonalsClear(l)) {
				Grid b2 = (Grid) b1.clone(); // Clone the current board 
				b2.occupySquare(l, m); // Place the queen on the new board
				GameTree child = new GameTree(b2, v + 1); // Create a new game tree node

				// Sets the childs data
				if (firstChild == null) {
					firstChild = child;
				} 
				else {
					prevChild.setSibling(child);
				}
				prevChild = child;

				s.push(child); // Pushes the new board onto the stack
			}
		}

		// Set the first child as the child of this node if not null
		if (firstChild != null) {
			setChild(firstChild);
		}
	}
	
	
	/**
	 *	buildGameDF
	 *	Generate the game tree in a depth-first manner
	 *	Pre-condition: the current tree isn't empty, the given stack
	 *				   and symbol are valid, and the given int value is
	 *				   positive and represents the desired depth of the
	 *				   tree (i.e. the number of queens to place on the
	 *				   board)
	 *	Post-condition: If the current tree is not already deep enough, 
	 *				    an additional level of possible moves is added
	 *					to the current game tree and each child tree of
	 *					the new level is pushed onto the stack.  Finally,
	 *					the	next place for expansion of the game tree is
	 *					determined by removing the top of the stack and
	 *					the process continues until the stack is empty
	 *					or a solution is found
	 *	Informally: generate the game tree from the current point
	 *				in a depth-first manner until it is "d" levels deep
	 *
	 *	@param s Stack of reachable but unexpanded game trees
	 *	@param m queen symbol to add to the board
	 *	@param d desired depth (number of moves ahead) that game tree should be built to
	 *
	 *	@return GameTree either the solution or an empty tree if there is no solution
	*/
	public GameTree buildGameDF(Stack s, Symbol m, int d) {
		trace("buildGameDF: buildGameDF starts");

		// Checks if it is empty then returns a new game tree
		if (isEmpty()) {
			return new GameTree();
		}

		s.push(this); // Pushes the current board onto the stack

		/*
		 	while the stack is not empty, check if the current game is solved.
			if it is solved return the solution.
		*/
		while (!s.isEmpty()) {
			GameTree t = (GameTree) s.top(); 
			s.pop(); // Gets the current game tree
			Grid grid = (Grid) t.getData(); 

			// Checks if the grid is solved 
			if (grid.solved()) {

				// Return the solution if it is solved
				while (!s.isEmpty()) {
					s.pop();
				}
				this.setData(t.getData());
				this.setLevel(t.getLevel());

				return t; // Return the solution
			}

			// checks the current level
			if (t.getLevel() < d) {
				t.generateLevelDF(s, m);
			}
		}

		// Return a new emtpy game tree if no solution is found
		return new GameTree();
	}
	
	
	/**
	 *	generateLevelBF
	 *	Generate the next level of the tree
	 *	Pre-condition: the given queue is defined, and the given
	 *				   symbol is defined
	 *	Post-condition: an additional level of possible moves has
	 *					been added to the current game tree and each
	 *					tree node of the new level also has been
	 *					added onto the queue.
	 *	Informally: generate the next level of the game tree
	 *
	 *	@param q Queue of reachable but unexpanded game trees
	 *	@param m queen symbol to add to the level
	*/
	public void generateLevelBF(Queue q, Symbol m)
	{
		final int MINIMUM = 1;	// minimum row and column number

		GameTree t;		// new game tree leaf being created
		int v;			// level for new leaf
		int d;			// dimension of current game tree's board
		Grid b1;		// board of current game tree
		Grid b2;		// new board for game tree leaf being created
		Location l;		// potential location for queen on new board

		trace("generateLevelBF: generateLevelBF starts");
		
//COMPLETE ME
		
		trace("generateLevelBF: generateLevelBF ends");
	}
	
	
	/**
	 *	buildGameBF
	 *	Generate the game tree in a breadth-first manner
	 *	Pre-condition: the current tree isn't empty, the given queue
	 *				   and symbol are valid, and the given int value is
	 *				   positive and represents the desired depth of the
	 *				   tree (i.e. the number of queens to place on the
	 *				   board)
	 *	Post-condition: If the current tree is not already deep enough, 
	 *				    an additional level of possible moves is added
	 *					to the current game tree and each child tree of
	 *					the new level is added onto the queue.  Finally,
	 *					the	next place for expansion of the game tree is
	 *					determined by removing the front of the queue
	 *					and the process continues until the queue is
	 *					empty or a solution is found
	 *	Informally: generate the game tree from the current point
	 *				in a breadth-first manner until it is "d" levels
	 *				deep
	 *
	 *	@param q Queue of reachable but unexpanded game trees
	 *	@param m queen symbol to add to the board
	 *	@param d desired depth (number of moves ahead) that game tree should be built to
	 *
	 *	@return GameTree either the solution or an empty tree if there is no solution
	*/
	public GameTree buildGameBF(Queue q, Symbol m, int d)
	{
		GameTree t;		// result
		
		trace("buildGameBF: buildGameBF starts");
		
//COMPLETE ME

		trace("buildGameBF: buildGameBF ends");

		return t;
	}				


	/**
	 *	rootNodeToString
	 *	String conversion for root node value
	 *	Pre-condition: none
	 *	Post-condition: a String object is returned consisting of the
	 *				String representation of the value within the
	 *				root node, followed by " " or "<>" if the GameTree
	 *				object is the empty tree
	 *	Informally: produce a String representation of the tree's root
	 *				node
	 *
	 *	@return String printable equivalent of root node contents
	*/
	protected String rootNodeToString() {
		String s;	// result

		trace("rootNodeToString: rootNodeToString starts");
		
		if (isEmpty()) {
			// empty tree so no value at all
			s = "<>";
		}
		else {
			// non-empty tree so grab String version of the data item
			s = getData().toString() + " ";
		}

		trace("rootNodeToString: rootNodeToString ends");

		// Return the root node as a string 
		return s;
	}
	
	
	/**
	 *	toString
	 *	String conversion for tree
	 *	Pre-condition: none
	 *	Post-condition: a String object is returned consisting of the
	 *					String representation of all items in the GameTree,
	 *					from top to bottom in depth-first order, separated by
	 *					" " and contained within "<" and ">"
	 *	Informally: produce a String representation of the Stack
	 *
	 *	@return String printable contents of game tree
	*/
	public String toString() {
		GameTree c;		// traversal variable
		String s;		// result

		trace("toString: toString starts");
		
		if (isEmpty()) {
			// empty tree so no value at all
			s = "<>";
		}
		else {
			// non-empty tree so start at the top...
			s = rootNodeToString();

			// ...and then work down...
			c = getChild();
			if (! c.isEmpty()) {
				s += c.toString();
			}

			// ... and across
			c = getSibling();
			if (! c.isEmpty()) {
				s += c.toString();
			}
		}

		trace("toString: toString ends");

		// Return the game tree as a string
		return s;
	}


	/**
	 *	trace
	 *	Provide trace output.
	 *	Pre-condition: none
	 *	Post-condition: if trace output is desired then the given String
	 *					parameter is shown on the console
	 *	Informally: show the given message for tracing purposes
	 *
	 *	@param s String to display as tracing message
	*/
	protected void trace(String s) {
		if (TRACING) {
			System.out.println("GameTree: " + s);
		}
	}
}


// if (!isEmpty()) {
		// 	System.out.println("passed empty game tree check");
		// 	// get the current game tree
		// 	t = this;
		// 	v = t.getLevel(); // new level is one more than current
		// 	d = ((Grid) t.root.getData()).getDimension(); // get dimension of board
		// 	b1 = (Grid) t.root.getData(); // get the current board

		// 	// loop through all locations on the board
		// 	//while (v < d && !s.isEmpty()){
		// 		//System.out.println("d = " + d + " Current level = " + v);
		// 		for (int i = MINIMUM; i <= 5; i++) {
		// 			for (int j = MINIMUM; j <= 5; j++) {
		// 				l = new Location(i, j); // create a new location
		// 				// check if the location is valid for placing a queen
		// 				if (b1.rowClear(l) && b1.columnClear(l) && b1.diagonalsClear(l)) {
		// 					//System.out.println("passed valid move check");
		// 					b2 = (Grid) b1.clone(); // copy the current board
		// 					b2.occupySquare(l, m); // place the queen on the new board
		// 					// create a new game tree leaf with the new board and level
		// 					//System.out.println("'New game tree leaf: " + b2.toString());
		// 					t = new GameTree(b2, v);
		// 					setSibling(t);
		// 					setChild(t.buildGameDF(s, m, d));
		// 					//System.out.println("New game tree leaf: " + t.toString());
		// 					// push the new game tree onto the stack
		// 					s.push(t);
		// 					//System.out.println("Stack is now: " + s.toString());
		// 					//System.out.println("generate new level after adding to stack");
		// 					count = count + 1; // increment the count of game tree leaves
		// 					//System.out.println("Count equals " + count);
		// 			}
		// 		}
		// 	}

		// 	//}
		// }



		//SECOND ONE
		// if (s.isEmpty()) {
		// 	t = new GameTree();
		// 	s.push(t);
		// }
		// else{
		// 	t = (GameTree) s.top();
		// }
		// if (!s.isEmpty()){
		// 	trace("passed empty game tree check");
		// 	//s.push(t);
		// 	System.out.println("d = " + d + "Current level = " + t.getLevel());
		// 	while (t.getLevel() < 5 && !s.isEmpty()) {
		// 		System.out.println("t level = " + t.getLevel());
		// 		t.generateLevelDF(s, m);
		// 		t.setLevel(t.getLevel() + 1);
		// 		//System.out.println("Current game tree: " + t.toString());
		// 		//System.out.println("Current stack: " + s.toString());
		// 		//trace("pushing t onto stack");
		// 		//s.push(t);
		// 	}
		// }
		// return t;
		// //System.out.println("Current stack: " + s.toString());
		// // GameTree result = new GameTree();
		// // if(!s.isEmpty()){
		// // 	Grid c = (Grid) ((GameTree) s.top()).getData();
		// // 	Stack cStack = s;
		// // 	while (c != null && !cStack.isEmpty()) {
		// // 		if (c.solved()){
		// // 			GameTree cTree = new GameTree(c, c.getDimension());
		// // 			//System.out.println("Solution found: " + cTree.toString());
		// // 			result = cTree;
		// // 		}
		// // 		else{
		// // 			cStack.pop();
		// // 			if (!cStack.isEmpty()){
		// // 				c = (Grid) ((GameTree)cStack.top()).getData();
		// // 			}
		// // 		}
		// // 	}
		// // }

		// // trace("buildGameDF: buildGameDF ends");
		// // //System.out.println("No solution found" + t.toString());
		// // return result;