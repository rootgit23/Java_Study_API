package com.im.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		WorkerService ws = new WorkerService();
		WorkerDTO [] c = ws.init();
		WorkerView wv = new WorkerView();
		wv.view(c);
		

	}

}
