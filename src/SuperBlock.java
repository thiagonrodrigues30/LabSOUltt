/**
 * Class representing the super block.
 * 
 * TO DO: This has to be refactored so to allow
 * the data in this class to be declared as private
 * This will require getter/setter methods for each data element.
 */

class SuperBlock {
	// number of blocks in the file system.
	private int size;
	//public int size;
	// number of index blocks in the file system. 
	private int iSize;
	//public int iSize;
	// first block of the free list
	private int freeList;
	//public int freeList;
	
	public SuperBlock(int size, int iSize, int freeList) {
		this.size = size;
		this.iSize = iSize;
		this.freeList = freeList;	
	}
	
	public void zerarSuperBlock() {
		this.size = 0;
		this.iSize = 0;
		this.freeList = 0;	
	}
	
	public void setSize(int size){
		this.size = size;
	}
	
	public void setISize(int iSize){
		this.iSize = iSize;
	}
	
	public void setFreeList(int freeList){
		this.freeList = freeList;
	}
	
	public int getSize(){
		return size;
	}
	
	public int getISize(){
		return iSize;
	}
	
	public int getFreeList(){
		return freeList;
	}

	public String toString () {
		return
			"SUPERBLOCK:\n"
			+ "Size: " + size
			+ "  Isize: " + iSize
			+ "  freeList: " + freeList;
	}
	
}
