package hu.csega.ficbidta.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import hu.csega.ficbidta.FicbidtaEditor;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuCreator extends ToolComponent {

	public MenuCreator(AbstractTool tool) {
		super(tool);
	}

	public void createMenuBar() {
		AbstractTool tool = getTool();
		JMenuBar jmb = new JMenuBar();

		JMenu jmFile = new JMenu("File");

		if(tool.getMessage() != null) {
			JMenuItem jmiNew = new JMenuItem("New");
			JMenuItem jmiLoad = new JMenuItem("Load");
			JMenuItem jmiSave = new JMenuItem("Save");
			JMenuItem jmiExit = new JMenuItem("Exit");
			jmFile.add(jmiNew);
			jmFile.add(jmiLoad);
			jmFile.add(jmiSave);
			jmFile.addSeparator();
			jmFile.add(jmiExit);
			jmiNew.addActionListener(new MenuNewListener(tool));
			jmiLoad.addActionListener(new MenuLoadListener(tool));
			jmiSave.addActionListener(new MenuSaveListener(tool));
			jmiExit.addActionListener(new MenuExitListener(tool));
		} else {
			JMenuItem jmiSaveAndClose = new JMenuItem("Save and Close");
			JMenuItem jmiCancel = new JMenuItem("Cancel");
			jmFile.add(jmiSaveAndClose);
			jmFile.add(jmiCancel);
			jmiSaveAndClose.addActionListener(new MenuSaveAndCloseListener(tool));
			jmiCancel.addActionListener(new MenuCancelListener(tool));
		}

		jmb.add(jmFile);

		JMenu jmEdit = new JMenu("Edit");
		JMenuItem jmiUndo = new JMenuItem("Undo");
		JMenuItem jmiRedo = new JMenuItem("Redo");
		JMenuItem jmiName = new JMenuItem("Set/Change Name");
		JMenuItem jmiType = new JMenuItem("Set/Change Type");
		JMenuItem jmiProperties = new JMenuItem("Change Properties");
		jmEdit.add(jmiUndo);
		jmEdit.add(jmiRedo);
		jmEdit.add(new JSeparator());
		jmEdit.add(jmiName);
		jmEdit.add(jmiType);
		jmEdit.add(jmiProperties);
		jmb.add(jmEdit);

		JMenu jmView = new JMenu("View");
		JMenuItem jmiCenter = new JMenuItem("Center Position");
		jmView.add(jmiCenter);
		jmb.add(jmView);

		JMenu jmCode = new JMenu("Code");
		JMenuItem jmiGenerate = new JMenuItem("Generate");
		jmCode.add(jmiGenerate);
		jmb.add(jmCode);

		JMenu jmHelp = new JMenu("Help");
		JMenuItem jmiAbout = new JMenuItem("About");
		jmHelp.add(jmiAbout);
		jmb.add(jmHelp);

		jmiUndo.addActionListener(new MenuUndoListener(tool));
		jmiRedo.addActionListener(new MenuRedoListener(tool));
		jmiName.addActionListener(new MenuNameListener(tool));
		jmiType.addActionListener(new MenuTypeListener(tool));
		jmiProperties.addActionListener(new MenuPropertiesListener(tool));
		jmiCenter.addActionListener(new MenuCenterPositionListener(tool));
		jmiGenerate.addActionListener(new MenuGenerateListener(tool));
		jmiAbout.addActionListener(new MenuAboutListener(tool));

		getComponent(FicbidtaEditor.class).getWindow().setJMenuBar(jmb);
	}

}
