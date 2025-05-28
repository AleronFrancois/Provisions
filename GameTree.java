
/**
 *	GameTree ADT
 *
 *	@author Iola Fleming 730234 and Aleron Francois 691807
 *	@version 28/05/2025
 *  NOTE - NQueens included due to the change to add a showStatus update when solution found
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
	//Completed by Iola Fleming 730234
	//Constructor for GameTree, sets root to null
	public GameTree() {
		trace("GameTree: constructor starts");

		Grid g = new Grid();
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
	//Edited by Iola Fleming 730234 to also return true if the grid is empty, to be used for testing if game is empty in NQueens
	//As without returning a defined empty grid of dimensions, an 8 by 8 was produced.
	//This addition does not affect it's other implementations
	public boolean isEmpty() {
		trace("isEmpty: isEmpty starts and ends");
		if(root == null){
			return true;
		}
		else{
			return(((Grid) root.getData()).isEmpty());
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
	//Completed by Iola Fleming 730234
	//Returns the data of the root node, throws an exception if the tree is empty
	public Object getData() throws EmptyGameTreeException {
		trace("getData: getData starts");
		
		if (isEmpty()) {
			trace("getData: empty game tree");
			throw new EmptyGameTreeException();
		}
		else {
			trace("getData: getData ends");
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
	//Completed by Iola Fleming 730234
	//Returns the sibling of the root node, throws an exception if the tree is empty
	public GameTree getSibling() throws EmptyGameTreeException {
		GameTree r;
		
		trace("getSibling: getSibling starts");
		
		if (isEmpty()) {
			trace("getSibling: empty game tree");
			throw new EmptyGameTreeException();
  		}
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
	//Completed by Iola Fleming 730234
	//Sets the data of the root node to the passed in value, throws an exception if the tree is empty
	public void setData(Object o) throws EmptyGameTreeException {
		trace("setData: setData starts");
		
		if (isEmpty()) {
			trace("setData: empty game tree");
			throw new EmptyGameTreeException();
		}
		else{
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
	//Completed by Iola Fleming 730234
	//sets the level of the root TNode to the passes in integer, throws an exception if the tree is empty
	public void setLevel(int l) throws EmptyGameTreeException {
		trace("setLevel: setLevel starts");
		
		if (isEmpty()) {
			trace("setLevel: empty game tree");
			throw new EmptyGameTreeException();
  		}
		else{
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
	//Completed by Iola Fleming 730234
	//Sets the sibling of the root TNode, to the root of a passed in Game Tree, throws an exception if the tree is empty
	public void setSibling(GameTree t) throws EmptyGameTreeException {
		trace("setSibling: setSibling starts");
		
		if (isEmpty()) {
			trace("setSibling: empty game tree");
			throw new EmptyGameTreeException();
		}
		else{
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
	//Completed by Iola Fleming 730234 and Aleron Francois 691807
	//Used to create a new level of options of GameTrees
	public void generateLevelDF(Stack s, Symbol m)
	{
		final int MINIMUM = 1;	// minimum row and column number

		GameTree t;		// new game tree leaf being created
		int v;			// level for new leaf
		int d;			// dimension of current game tree's board
		Grid b1;		// board of current game tree
		Grid b2;		// new board for game tree leaf being created
		Location l;	    // potential location for queen on new board

		trace("generateLevelDF: generateLevelDF starts");

		v = getLevel(); //getLevel of current game tree\
		d = ((Grid) root.getData()).getDimension(); // get dimension of root board
		b1 = (Grid) root.getData(); // gets the current grid from the root node
	 
			//Loops through all locations on the board, if the location is clear
			//then a new GameTree is created with the a new queen on the grid in the valid location
			//it is set as the child of the current GameTree and pushed on to the stack
			for(int i = MINIMUM; i <= d; i++) {
				for(int j = MINIMUM; j <= d; j++){
					l = new Location(i,j);
					if (b1.rowClear(l) && b1.columnClear(l) && b1.diagonalsClear(l)) {
						b2 = (Grid) b1.clone();
						b2.occupySquare(l, m);
						t = new GameTree(b2, v + 1);
					    setChild(t);
						s.push(t);
					}
				}
			}

		trace("generateLevelDF: generateLevelDF ends");
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
	//Completed by Iola Fleming 730234 and Aleron Francois 691807
	//Builds the game tree, by looping until the stack is empty and adding new levels,
	//either returns a solution or an empty grid to be displayed
	public GameTree buildGameDF(Stack s, Symbol m, int d)
	{
		GameTree t;	// result
		
		trace("buildGameDF: buildGameDF starts");
		
		t = this; // starts with the current game tree

		//if the tree is empty, return an empty tree
		if(isEmpty()){
			return new GameTree(new Grid(d), 0);
		}
		//if the stack is initially empty, set the top to t so we have a starting point
		if (s.isEmpty()){
			s.push(t);
		}
		//continue until the stack is empty, or the level is exceeded
		//Sets t to the top of the stack, and then continues down it's children to find the fullest board
		//then if t is solved, return t, if not, make new levels from t and go to the next item in the stack, is the stack is not now empty
		//if no solution is found, a new empty grid with the same dimensions is returned
		while(!s.isEmpty() && t.getLevel() < d){
			t = (GameTree) s.top();
			while(!t.getChild().isEmpty()){
				t = t.getChild();
			}
			if (((Grid) t.getData()).solved()){
				return t;
			}
			else{
				t.generateLevelDF(s, m);
				if (!s.isEmpty()){
					s.pop();
					//repeats test to ensure s is not empty after being popped, can't combine as s need to be empty regardless if t becomes s.top()
					if(!s.isEmpty()){
						t = (GameTree) s.top();
					}
				}
				else {
					return new GameTree(new Grid(d), 0);
				}
			}
		}
		return new GameTree(new Grid(d), 0);
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
	//Completed by Iola Fleming 730234
	//Generates new set of options to be added to the GameTree
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

		v = getLevel(); //getLevel of current game tree\
		d = ((Grid) root.getData()).getDimension(); // get dimension of root board
		b1 = (Grid) root.getData(); // gets the current grid from the root node
	 
			//Loops through all locations on the board, if the location is clear
			//then a new GameTree is created with the a new queen on the grid in the valid location
			//it is set as the child of the current GameTree and added to the queue
			for(int i = MINIMUM; i <= d; i++) {
				for(int j = MINIMUM; j <= d; j++){
					l = new Location(i,j);
					if (b1.rowClear(l) && b1.columnClear(l) && b1.diagonalsClear(l)) {
						b2 = (Grid) b1.clone();
						b2.occupySquare(l, m);
						t = new GameTree(b2, v + 1);
					    setChild(t);
						q.add(t);
					}
				}
			}
		
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
	//Completed by Iola Fleming 730234
	//Builds the game tree, by looping until the stack is empty and adding new levels,
	//either returns a solution or an empty grid to be displayed
	public GameTree buildGameBF(Queue q, Symbol m, int d)
	{
		GameTree t;		// result
		
		trace("buildGameDF: buildGameDF starts");
		
		t = this; // starts with the current game tree

		//if the tree is empty, return an empty tree
		if(isEmpty()){
			return new GameTree();
		}
		//if the queue is initially empty, set the top to t so we have a starting point
		if (q.isEmpty()){
			q.add(t);
		}
		//continue until the queue is empty, or the level is exceeded
		//Sets t to the top of the queue, and then continues down it's children to find the fullest board
		//then if t is solved, return t, if not, make new levels from t and go to the next item in the queue, provided the queue has not become empty
		//Additionaly checks that t is not now solvable, if so return t
		//if no solution is found, a new empty grid with the same dimensions is returned
		while(!q.isEmpty() && t.getLevel() < d){
			t = (GameTree) q.front();
			while(!t.getChild().isEmpty()){
				t = t.getChild();
			}
			if (((Grid) t.getData()).solved()){
				while(!q.isEmpty()){
					q.remove();
				}
				return t;
			}
			else{
				t.generateLevelBF(q, m);
				if (!q.isEmpty()){
					q.remove();
					if(!q.isEmpty()){
						t = (GameTree) q.front();
					}
					if (((Grid) t.getData()).solved()){
						return t;
					}
				}
				else {
					return new GameTree(new Grid(d), 0);
				}


			}
		}
		return new GameTree(new Grid(d), 0);
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