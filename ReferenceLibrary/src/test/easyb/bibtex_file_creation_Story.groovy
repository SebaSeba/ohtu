import referencelibrary.*
import referencelibrary.UI.*
import referencelibrary.data.StubDao

description """User can create a BibTex-file containing
                all the references that have been entered to system"""

scenario "User can create Bibtex-file", {
    given 'command generate is selected', {
        io = new StubIO("a", "B", "1", "2", "3", "4", "5", "q")
        app = new App(new StubDao())
        ui = new UI(io, app)
    }
 
    when 'a new reference is made and valid data is entered', {
      ui.run()
    }

    then 'new reference is added to the system', {
      io.getPrints().shouldHave("Generating done!")
    }
}
