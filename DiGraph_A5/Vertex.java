package DiGraph_A5;

import java.util.*;

public class Vertex {
	
	protected long id;
	protected int topNum;
	protected int inDegreeNum = 0;
	protected String nodeLabel;
	protected HashMap<String, Edge> adjacentList = new HashMap<>();
	protected HashSet<String> outDegrees = new HashSet<>();
	protected HashSet<String> inDegrees = new HashSet<>();
	protected HashSet<Long> vertexEdgeIds = new HashSet<>();
	
	Vertex(long idNum, String label){
		id = idNum;
		nodeLabel = label;
	}
	public long getId(){
		return id;
	}
	public String getNodeLabel(){
		return nodeLabel;
	}
	public void setAdjacentList(String vertex, Edge newEdge){
		outDegrees.add(vertex);
		vertexEdgeIds.add(newEdge.getId());
		adjacentList.put(vertex, newEdge);
	}
	public Boolean containAdjacentList(String vertex, Edge newEdge){
		return adjacentList.containsKey(vertex);
	}
	public void removeAdjacentList(String vertex){
		outDegrees.remove(vertex);
		vertexEdgeIds.remove(adjacentList.get(vertex).getId());
		adjacentList.remove(vertex);
	}
	public Map<String, Edge> getAdjacentList(){
		return adjacentList;
	}
	public void setInDegrees(String vertex){
		inDegreeNum++;
		inDegrees.add(vertex);
	}
	public HashSet<String> getInDegrees(){
		return inDegrees;
	}
	public void removeInDegrees(String vertex){
		inDegreeNum--;
		inDegrees.remove(vertex);
	}
	public HashSet<Long> getVertexEdgeIds(){
		return vertexEdgeIds;
	}
	public void setTopNum(int num){
		topNum = num;
	}
	public int getTopNum(){
		return topNum;
	}
	public int getInDegreeNum(){
		return inDegreeNum;
	}
	public HashSet<String> getOutDegrees(){
		return outDegrees;
	}
}
