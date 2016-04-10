# schedule-analyzer
schedule-analyzer


Hi!  I'd like to walk you through some of my design decision to clear up any potential confusion.  

Given the nature of this challenge, and the fact that my OCD is in direct conflict with an incomplete application, I'd like to make a few points.

In general, designed to an inteface is my MO (which is good cause Spring forces it with the Proxy)
Hibernate was the ORM of choice for the user and shift objects. I didn't see a lot of reasons to overcomplicate with a ton of persisted objects.  Ultimately, those are what matter.
Having said that, wiring For Hibernate is relatively trivial in spring context.xml file, to show that I have the ability to read documentation and insert some xml mark up really isn't an effective use of time.
There are the @Table annotations on the Shift/User objects which will basically allow me to get around some of the hibernate xml config markup.  I Think the variables might need an @Column annotation to map the variable to the table name, but again, that's relatively trivial, you should be able to tell from the object model what makes sense for the mapping in a db.

I used the spring framework, but if you notice I haven't used autowiring.  This is intentional, and I believe pretty strongly in using direct bean creation and explicitly injection into a context.xml because it gives you better control over possible circular dependencies (and you can spot them more easily in the debugger).  It's something my mentor pushed when I worked with him and it simply stuck, call it a habit and I understand a lot of people disagree.  I'm sure that the merits and pitfalls of auto wiring a wonderful discussion to have over beers (probably shortly after a heated debate of VIM vs Emacs) but it's a methodology I try to stick with, with exception to very specific circumstances.
Resources talk to Services, Services Talk to DAOs, etc.  Again, the markup in the context is relatively trivial, it just kind of needs to be hooked up from the objects I currently have.

Due to some time constraints, I don't have much of a front end:
I would likely use jaxb to marshal/unmarshal data to and from the interface (probably JSON), using REST service calls (get UserSummary information, blah blah)
The Analysis Result object was intended to contain a set of UserSummaries for display purposes for either an administrator or a resident.
I'm fairly certain there is some sort of calendar plugin in one of the many js libraries that would have worked out the Shift/Event on calendar view requirement.  JQuery looked like it has a few.
Ideally, I would have a DutyHoursResource which talked to a DutyHoursService that chopped off whatever date restrictions were listed in the requirements, that would have kicked off the DutyHoursAanlyzerWorker class, which has a collection of VolatiionWorkers that would search for the given violation type listed in the worker.  UserSummaries can be created from there to roll up the information in the DB, and pushed into an AnalysisResult object to ferry to the User interface.
Similar items for any User functions: (adding a user, yada yada) or shift functions (Shift Entry), each would have had a resource which talked to a service with whatever business logic.

Thanks!
