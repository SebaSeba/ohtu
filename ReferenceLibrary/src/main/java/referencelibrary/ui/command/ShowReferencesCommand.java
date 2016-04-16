package referencelibrary.ui.command;

import referencelibrary.App;
import referencelibrary.IO;

/**
 * Created by petri on 16.4.2016.
 */
public class ShowReferencesCommand extends Command {

    public ShowReferencesCommand(App app, IO io) {
        super(app, io);
    }

    @Override
    public void execute() {
        app.listReferences().forEach(reference -> io.print(reference.toString()));
    }
}
