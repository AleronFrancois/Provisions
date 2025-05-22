//KIT107 Assignment 3
/**
 *	GameTree ADT
 *
 *	@author <Insert names and student IDs>
 *	@version <Insert date>
 *	
 *	This file holds the GameTree ADT which is a
 *	general game tree.  The GameTree is built using
 *	TNode ADTs.  A GameTree object consists of a
 *	"root" field which refers to a TNode object.
 *	
 *	YOU NEED TO MAKE CHANGES TO THIS FILE!
*/


public class GameTree implements GameTreeInterface
{
	// finals
	protected final boolean TRACING = false;	// do we want to see trace output?

	// properties
	protected TNode root;						// the node at the top of the tree


	/**
	 *	GameTree
	 *	Constructor method 1.
	 *	Pre-condition: none
	 *	Post-condition: the GameTree object's "root" field is null
	 *	Informally: creates an empty tree
	*/
	public GameTree()
	{
		trace("GameTree: constructor starts");
		
//COMPLETE ME
		
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
	public GameTree(Object o, int l)
	{
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
	public boolean isEmpty()
	{
		trace("isEmpty: isEmpty starts and ends");
		
		return (root == null);
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
	public Object getData() throws EmptyGameTreeException
	{
		trace("getData: getData starts");
		
		if (isEmpty())
		{
			trace("getData: empty game tree");
			throw new EmptyGameTreeException();
		}

		trace("getData: getData ends");
//COMPLETE ME
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
	public int getLevel() throws EmptyGameTreeException
	{
		trace("getLevel: getLevel starts");
		
		if (isEmpty())
		{
			trace("getLevel: empty game tree");
			throw new EmptyGameTreeException();
		}	
		
		trace("getLevel: getLevel ends");
//COMPLETE ME
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
	public GameTree getChild() throws EmptyGameTreeException
	{
		GameTree r;
		
		trace("getChild: getChild starts");
		
		if (isEmpty())
		{
			trace("getChild: empty game tree");
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
	public GameTree getSibling() throws EmptyGameTreeException
	{
		GameTree r;
		
		trace("getSibling: getSibling starts");
		
		if (isEmpty())
		{
			trace("getSibling: empty game tree");
			throw new EmptyGameTreeException();
  		}
  		
//COMPLETE ME

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
	public void setData(Object o) throws EmptyGameTreeException
	{
		trace("setData: setData starts");
		
		if (isEmpty())
		{
			trace("setData: empty game tree");
			throw new EmptyGameTreeException();
		}
		
//COMPLETE ME
		
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
	public void setLevel(int l) throws EmptyGameTreeException
	{
		trace("setLevel: setLevel starts");
		
		if (isEmpty())
		{
			trace("setLevel: empty game tree");
			throw new EmptyGameTreeException();
  		}
  		
//COMPLETE ME
		
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
	public void setChild(GameTree t) throws EmptyGameTreeException
	{
		trace("setChild: setChild starts");
		
		if (isEmpty())
		{
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
	public void setSibling(GameTree t) throws EmptyGameTreeException
	{
		trace("setSibling: setSibling starts");
		
		if (isEmpty())
		{
			trace("setSibling: empty game tree");
			throw new EmptyGameTreeException();
		}
		  
//COMPLETE ME

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
	public void generateLevelDF(Stack s, Symbol m)
	{
		final int MINIMUM = 1;	// minimum row and column number

		GameTree t;		// new game tree leaf being created
		int v;			// level for new leaf
		int d;			// dimension of current game tree's board
		Grid b1;		// board of current game tree
		Grid b2;		// new board for game tree leaf being created
		Location l;		// potential location for queen on new board
	
		trace("generateLevelDF: generateLevelDF starts");
		
//COMPLETE ME
		
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
	public GameTree buildGameDF(Stack s, Symbol m, int d)
	{
		GameTree t;		// result
		
		trace("buildGameDF: buildGameDF starts");
		
//COMPLETE ME

		trace("buildGameDF: buildGameDF ends");

		return t;
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
	protected String rootNodeToString()
	{
		String s;	// result

		trace("rootNodeToString: rootNodeToString starts");
		
		if (isEmpty())
		{
			// empty tree so no value at all
			s = "<>";
		}
		else
		{
			// non-empty tree so grab String version of the data item
			s = getData().toString() + " ";
		}

		trace("rootNodeToString: rootNodeToString ends");
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
	public String toString()
	{
		GameTree c;		// traversal variable
		String s;		// result

		trace("toString: toString starts");
		
		if (isEmpty())
		{
			// empty tree so no value at all
			s = "<>";
		}
		else
		{
			// non-empty tree so start at the top...
			s = rootNodeToString();

			// ...and then work down...
			c = getChild();
			if (! c.isEmpty())
			{
				s += c.toString();
			}

			// ... and across
			c = getSibling();
			if (! c.isEmpty())
			{
				s += c.toString();
			}
		}

		trace("toString: toString ends");
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
	protected void trace(String s)
	{
		if (TRACING)
		{
			System.out.println("GameTree: " + s);
		}
	}
}
