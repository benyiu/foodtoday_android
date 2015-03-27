package com.hoyoji.android.hyjframework.fragment;

import com.hoyoji.android.hyjframework.HyjApplication;
import com.hoyoji.android.hyjframework.activity.HyjActivity.DialogCallbackListener;
import com.hoyoji.hoyoji.LoginActivity;
import com.hoyoji.foodtoday_android.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class HyjUserFragment extends HyjFragment {

	@Override
	public void onStart() {
		if(HyjApplication.getInstance().isLoggedIn()) {
			super.onStart();
		} else {
			super.onStartWithoutInitViewData();
		}
	}
	
}
