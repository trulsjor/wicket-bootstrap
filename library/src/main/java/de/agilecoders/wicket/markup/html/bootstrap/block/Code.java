package de.agilecoders.wicket.markup.html.bootstrap.block;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;

/**
 * Wrap inline snippets of code with <code> and use <pre> for multiple
 * lines of code. Angle brackets will be escaped in the code for proper rendering.
 *
 * @author miha
 * @version 1.0
 */
public class Code extends WebMarkupContainer {

    private final CodeBehavior codeBehavior;

    /**
     * Constructor.
     *
     * @param componentId The non-null id of a new component
     */
    public Code(final String componentId) {
        this(componentId, null);
    }

    /**
     * Constructor.
     *
     * @param componentId The non-null id of a new component
     * @param model       the component's model
     */
    public Code(final String componentId, final IModel<String> model) {
        super(componentId, model);

        codeBehavior = new CodeBehavior();
        add(codeBehavior);
    }

    /**
     * @return true, if line numbers will be rendered
     */
    public boolean hasLineNumbers() {
        return codeBehavior.hasLineNumbers();
    }

    /**
     * adds line numbers on the left side of code block.
     *
     * @return this instance
     */
    public Code setShowLineNumbers(final boolean showLineNumbers) {
        codeBehavior.setShowLineNumbers(showLineNumbers);

        return this;
    }

    /**
     * adds line numbers on the left side of code block.
     *
     * @return this instance
     */
    @Deprecated
    public Code addLineNumbers() {
        return setShowLineNumbers(true);
    }

    /**
     * defines from which line number the counting will start.
     *
     * @param from which line the numbers will count
     * @return this instance
     */
    public Code setStartFromLine(final int from) {
        codeBehavior.setStartFromLine(from);

        return this;
    }

    /**
     * sets the language.
     *
     * @param language the language to use
     * @return this instance
     */
    public Code setLanguage(CodeBehavior.Language language) {
        codeBehavior.setLanguage(language);

        return this;
    }

}
