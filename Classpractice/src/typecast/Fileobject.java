package typecast;

public class Fileobject {
	
	String Filename;
	String Filetype;
	int Filesize;
	byte []filecontent;//important
	String Directoryname;
	public Fileobject(String filename, String filetype, int filesize, byte[] filecontent, String directoryname) {
		super();
		Filename = filename;
		Filetype = filetype;
		Filesize = filesize;
		this.filecontent = filecontent;
		Directoryname = directoryname;
	}
	public String getFilename() {
		return Filename;
	}
	public void setFilename(String filename) {
		Filename = filename;
	}
	public String getFiletype() {
		return Filetype;
	}
	public void setFiletype(String filetype) {
		Filetype = filetype;
	}
	public int getFilesize() {
		return Filesize;
	}
	public void setFilesize(int filesize) {
		Filesize = filesize;
	}
	public byte[] getFilecontent() {
		return filecontent;
	}
	public void setFilecontent(byte[] filecontent) {
		this.filecontent = filecontent;
	}
	public String getDirectoryname() {
		return Directoryname;
	}
	public void setDirectoryname(String directoryname) {
		Directoryname = directoryname;
	}
}