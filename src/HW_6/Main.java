package HW_6;

import HW_6.controllers.NoteController;
import HW_6.model.*;
import HW_6.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("notes.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}