package yanagishima.module;

import yanagishima.servlet.FormatSqlServlet;
import yanagishima.servlet.KillServlet;
import yanagishima.servlet.PrestoServlet;
import yanagishima.servlet.QueryServlet;

import com.google.inject.servlet.ServletModule;

public class PrestoServletModule extends ServletModule {
	@Override
	protected void configureServlets() {
		bind(PrestoServlet.class);
		bind(QueryServlet.class);
		bind(KillServlet.class);
		bind(FormatSqlServlet.class);

		serve("/presto").with(PrestoServlet.class);
		serve("/query").with(QueryServlet.class);
		serve("/kill").with(KillServlet.class);
		serve("/format").with(FormatSqlServlet.class);

	}
}
