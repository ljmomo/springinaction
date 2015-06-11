package com.springinaction.springidol;

public class PeoticJuggler extends Juggler {
	private Poem poem;

	
	/**
	 * 创建一个新的实例 PeoticJuggler.
	 *
	 * @param poem
	 */
	public PeoticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PeoticJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	@Override
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting");
		poem.recite();
		System.out.println("While end");
	}
	
	
}
