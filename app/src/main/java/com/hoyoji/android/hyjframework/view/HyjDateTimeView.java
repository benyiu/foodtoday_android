package com.hoyoji.android.hyjframework.view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.hoyoji.android.hyjframework.HyjApplication;
import com.hoyoji.android.hyjframework.HyjUtil;
import com.hoyoji.android.hyjframework.activity.HyjActivity;
import com.hoyoji.android.hyjframework.activity.HyjUserActivity;
import com.hoyoji.android.hyjframework.activity.HyjActivity.DialogCallbackListener;
import com.hoyoji.android.hyjframework.fragment.HyjDateTimePickerDialogFragment;
import com.hoyoji.android.hyjframework.fragment.HyjDialogFragment;
import com.hoyoji.hoyoji.LoginActivity;
import com.hoyoji.foodtoday_android.R;
import com.hoyoji.hoyoji.friend.FriendCategoryListFragment;
import com.hoyoji.hoyoji.friend.FriendFormFragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HyjDateTimeView extends TextView {
	public HyjDateTimeView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	private Date mDate;
	private String mDateFormatStr = "HH:mm:ss";
	private DateFormat mDateFormat = new SimpleDateFormat(mDateFormatStr);
	public void setTime(Long timeInMillisec){
		if(timeInMillisec == null){
			setDate(null);
		} else {
			setDate(new Date(timeInMillisec));
		}
	}
	
	public void setDate(Date date){
		mDate = date;
		if(date == null){
			super.setText("");
		} else {
			super.setText(mDateFormat.format(date));
		}
	}
	
	public void setDateFormat(String dateFormatStr){
		if(!mDateFormatStr.equals(dateFormatStr)){
			mDateFormatStr = dateFormatStr;
			mDateFormat = new SimpleDateFormat(dateFormatStr);
		}
	}
	
	public Long getDate(){
		if(mDate == null){
			return null;
		} 
		return mDate.getTime();
	}
	
}
