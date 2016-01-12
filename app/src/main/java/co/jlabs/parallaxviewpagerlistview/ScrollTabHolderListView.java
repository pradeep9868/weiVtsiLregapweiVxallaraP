package co.jlabs.parallaxviewpagerlistview;

import android.content.Context;
import android.widget.ListView;

public abstract class ScrollTabHolderListView extends ListView implements ScrollTabHolder {

	protected ScrollTabHolder mScrollTabHolder;

	public ScrollTabHolderListView(Context context) {
		super(context);
	}

	public void setScrollTabHolder(ScrollTabHolder scrollTabHolder) {
		mScrollTabHolder = scrollTabHolder;
	}
}