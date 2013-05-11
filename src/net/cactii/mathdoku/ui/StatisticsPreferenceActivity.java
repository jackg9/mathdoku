package net.cactii.mathdoku.ui;

import android.app.Activity;
import android.os.Bundle;

public class StatisticsPreferenceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		getFragmentManager().beginTransaction()
				.replace(android.R.id.content, new StatisticsPreferenceFragment())
				.commit();
	}
}