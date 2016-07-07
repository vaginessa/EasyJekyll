package ui;

import jekyll.Post;

public class EditorOperations
{
	private Editor editor;
	private Post currPost;
	
	public EditorOperations( Editor editor )
	{
		this.editor = editor;
		this.currPost = this.editor.getPost();
	}
	
	public void save()
	{
		this.currPost.setTitle( this.editor.getTitle() );
		this.currPost.setContent( this.editor.getContent() );
		
		this.editor.saveNotification( this.currPost.save() );
	}
}