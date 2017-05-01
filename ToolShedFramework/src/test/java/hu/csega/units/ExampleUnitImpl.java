package hu.csega.units;

import hu.csega.toolshed.framework.services.TimeService;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class ExampleUnitImpl extends AbstractUnitWithState<ExampleUnitImpl, ExampleState> implements ExampleUnit {

	@Unit
	public void setExtraUnit(ExtraUnit extra) {
		this.extra = extra;
	}

	@New
	public void setTimeService(TimeService timeService) {
		this.timeService = timeService;
	}

	@Override
	public void run() {
		logger.info("extra: " + extra);

		stateInfo = "started";

		naturalStoppingPoint(ExampleState.INIT);

		logger.info("Before middle.");

		stateInfo = "processing";

		long start = timeService.currentDate().getTime();

		try {
			timeService.sleep(1000l);
		} catch(InterruptedException ex) {
			throw new RuntimeException(ex);
		}

		long end = timeService.currentDate().getTime();

		elapsed = end - start;

		naturalStoppingPoint(ExampleState.MIDDLE);

		logger.info("After middle.");

		stateInfo = "finished";

		naturalStoppingPoint(ExampleState.END);
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public long getElapsed() {
		return elapsed;
	}

	private ExtraUnit extra;
	private TimeService timeService;

	private long elapsed;
	private String stateInfo;

	private static final Logger logger = LoggerFactory.createLogger(ExampleUnitImpl.class);
}
