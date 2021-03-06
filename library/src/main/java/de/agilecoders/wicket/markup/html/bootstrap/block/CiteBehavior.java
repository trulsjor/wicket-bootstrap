package de.agilecoders.wicket.markup.html.bootstrap.block;

import de.agilecoders.wicket.markup.html.bootstrap.behavior.AssertTagNameBehavior;
import de.agilecoders.wicket.markup.html.bootstrap.behavior.BootstrapBaseBehavior;
import org.apache.wicket.Component;

/**
 * A CiteBehavior just asserts the correct tag name and appends the
 * {@link BootstrapBaseBehavior}.
 *
 * @author miha
 * @version 1.0
 */
public class CiteBehavior extends AssertTagNameBehavior {

    /**
     * Constructor.
     */
    public CiteBehavior() {
        super("cite");
    }

    @Override
    public void bind(Component component) {
        super.bind(component);

        component.add(new BootstrapBaseBehavior());
    }
}
