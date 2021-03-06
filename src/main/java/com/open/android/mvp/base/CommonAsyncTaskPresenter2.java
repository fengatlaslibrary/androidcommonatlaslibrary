/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-8-14下午4:22:27
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
package com.open.android.mvp.base;

import org.json.JSONObject;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.open.andenginetask.AsyncTaskUtils;
import com.open.andenginetask.CallEarliest;
import com.open.andenginetask.Callable;
import com.open.andenginetask.Callback;
import com.open.andenginetask.IProgressListener;
import com.open.andenginetask.ProgressCallable;
import com.open.android.mvp.presenter.CommonPresenter;
import com.open.android.mvp.view.CommonView;

/**
 *****************************************************************************************************************************************************************************
 * 
 * @author :fengguangjing
 * @createTime:2017-8-14下午4:22:27
 * @version:4.2.4
 * @modifyTime:
 * @modifyAuthor:
 * @description:
 *****************************************************************************************************************************************************************************
 */
public class CommonAsyncTaskPresenter2<T,P extends CommonPresenter,V extends CommonView<T, P>> implements CallEarliest<T>, Callback<T>, Callable<T>, ProgressCallable<T>, Response.Listener<JSONObject>, Response.ErrorListener , CommonPresenter{
	public String url;
	public int pageNo = 1;
	public Context mContext;
	public V mViewModel;
	
	/**反射类名*/
	public String className;
	/**反射方法名*/
	public String methodName;
	/**反射参数名*/
	public Class[] parameterTypes;
	/**反射参数值*/
	public Object[] args;
	/**
	 * 封装的asynctask方法，此方法没有进度框.
	 * 
	 * @param pCallEarliest
	 *            运行于主线程，最先执行此方法.
	 * @param mCallable
	 *            运行于异步线程,第二执行此方法.
	 * @param mCallback
	 *            运行于主线程,最后执行此方法.
	 */
	public <T> void doAsync(final CallEarliest<T> pCallEarliest, final Callable<T> mCallable, final Callback<T> mCallback) {
		AsyncTaskUtils.doAsync(pCallEarliest, mCallable, mCallback);
	}

	/**
	 * 封装的asynctask方法，此方法拥有进度对话框，并支持定义样式.
	 * 
	 * @param pContext
	 *            上下文
	 * @param styleID
	 *            对话框样式
	 *            ProgressDialog.STYLE_HORIZONTAL|ProgressDialog.STYLE_SPINNER
	 * @param pTitle
	 *            标题
	 * @param pMessage
	 *            内容
	 * @param pCallEarliest
	 *            运行于主线程，最先执行此方法.
	 * @param progressCallable
	 *            运行于异步线程,用于传递对话框进度.
	 * @param pCallback
	 *            运行于主线程,最后执行此方法.
	 */
	public <T> void doProgressAsync(final Context pContext, final int styleID, final String pTitleResID, final String pMessageResID, final CallEarliest<T> pCallEarliest,
			final ProgressCallable<T> pCallable, final Callback<T> pCallback) {

		AsyncTaskUtils.doProgressAsync(pContext, styleID, pTitleResID, pMessageResID, pCallEarliest, pCallable, pCallback);
	}

	/**
	 * 封装的asynctask方法，此方法拥有进度对话框，并支持定义样式.
	 * 
	 * @param pContext
	 *            上下文
	 * @param styleID
	 *            对话框样式
	 *            ProgressDialog.STYLE_HORIZONTAL|ProgressDialog.STYLE_SPINNER
	 * @param pTitle
	 *            标题,资源id
	 * @param pMessage
	 *            内容,资源id
	 * @param pCallEarliest
	 *            运行于主线程，最先执行此方法.
	 * @param progressCallable
	 *            运行于异步线程,用于传递对话框进度.
	 * @param pCallback
	 *            运行于主线程,最后执行此方法.
	 */
	public <T> void doProgressAsync(final Context pContext, final int styleID, final int pTitleResID, final int pMessageResID, final CallEarliest<T> pCallEarliest,
			final ProgressCallable<T> pCallable, final Callback<T> pCallback) {

		AsyncTaskUtils.doProgressAsync(pContext, styleID, pTitleResID, pMessageResID, pCallEarliest, pCallable, pCallback);
	}
	
	/* (non-Javadoc)
	 * @see com.android.volley.Response.ErrorListener#onErrorResponse(com.android.volley.VolleyError)
	 */
	@Override
	public void onErrorResponse(VolleyError error) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.android.volley.Response.Listener#onResponse(java.lang.Object)
	 */
	@Override
	public void onResponse(JSONObject response) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.open.andenginetask.ProgressCallable#call(com.open.andenginetask.IProgressListener)
	 */
	@Override
	public T call(IProgressListener pProgressListener) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.open.andenginetask.Callable#call()
	 */
	@Override
	public T call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.open.andenginetask.Callback#onCallback(java.lang.Object)
	 */
	@Override
	public void onCallback(T result) {
		// TODO Auto-generated method stub
		mViewModel.onCallback(result);
	}

	/* (non-Javadoc)
	 * @see com.open.andenginetask.CallEarliest#onCallEarliest()
	 */
	@Override
	public void onCallEarliest() throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.open.android.mvp.base.BasePresenter#start()
	 */
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.open.android.mvp.presenter.CommonPresenter#doAsync()
	 */
	@Override
	public void doAsync() {
		// TODO Auto-generated method stub
		doAsync(this, this, this);
	}

	/* (non-Javadoc)
	 * @see com.open.android.mvp.presenter.CommonPresenter#setPageNo(int)
	 */
	@Override
	public void setPageNo(int pageNo) {
		// TODO Auto-generated method stub
		this.pageNo = pageNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

}
