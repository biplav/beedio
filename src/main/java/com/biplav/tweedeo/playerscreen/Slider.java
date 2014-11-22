package com.biplav.tweedeo.playerscreen;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Widget;

public class Slider extends Widget {

	private String id;
	private int total = 0;

	public Slider(String id) {
		super();
		this.id = id;
		Element divEle = DOM.createDiv();
		setElement(divEle);
		divEle.setId(id);
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		createWidget(id, total);
	}

	public void updateSlider(int loaded, int position, int total) {
		if(this.total != total) {
			this.total=total;
			updateSliderPos(id, (100 - loaded), position, total);
		}
		updateSliderPos(id, (100 - loaded), position, 0);
	}
	
	public void updateSlider(int loaded) {
		updateSliderPos(id, (100 - loaded));
	}
	
	final private native void updateSliderPos(String id, int loaded) /*-{
		$wnd.$('#' + id).find(
				'.ui-widget-header').css('width', loaded + '%');
	}-*/;

	final private native void updateSliderPos(String id, int loaded,
			int position, int total) /*-{

		if (total != 0) {
			$wnd.$('#' + id).slider('option', 'max', total);
		}

		$wnd.$('#' + id).slider('option', 'value', position).find(
				'.ui-widget-header').css('width', loaded + '%');
	}-*/;

	final private native void createWidget(String id, int total)/*-{
		$wnd.$("#" + id).slider({
			range : "max",
			min : 0,
			max : total,
			value : 1
		}).css('background-image', 'url(http://i56.tinypic.com/fbjad2.png)');
	}-*/;

}
