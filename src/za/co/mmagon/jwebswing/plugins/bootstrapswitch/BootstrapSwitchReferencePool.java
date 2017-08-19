package za.co.mmagon.jwebswing.plugins.bootstrapswitch;

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum BootstrapSwitchReferencePool implements ReferencePool
{
    BootstrapSwitch(new JavascriptReference("BootstrapSwitch", 3.3, "bower_components/bootstrap-switch/dist/js/bootstrap-switch.js"),
            new CSSReference("BootstrapSwitch", 3.3, "bower_components/bootstrap-switch/dist/css/bootstrap3/bootstrap-switch.css"));
    /**
     * Any sub data
     */
    private String data;

    /**
     * A new AngularSlimScrollReferencePool
     */
    private BootstrapSwitchReferencePool()
    {

    }

    /**
     * A new AngularSlimScrollReferencePool with data
     */
    private BootstrapSwitchReferencePool(String data)
    {

    }

    private JavascriptReference javaScriptReference;
    private CSSReference cssReference;

    private BootstrapSwitchReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
    {
        this.javaScriptReference = javaScriptReference;
        if (this.javaScriptReference != null)
        {
            this.javaScriptReference.setPriority(RequirementsPriority.DontCare);
        }
        this.cssReference = cssReference;
        if (this.cssReference != null)
        {
            this.cssReference.setPriority(RequirementsPriority.DontCare);
        }
    }

    @Override
    public JavascriptReference getJavaScriptReference()
    {
        return javaScriptReference;
    }

    @Override
    public void setJavaScriptReference(JavascriptReference javaScriptReference)
    {
        this.javaScriptReference = javaScriptReference;
    }

    @Override
    public CSSReference getCssReference()
    {
        return cssReference;
    }

    @Override
    public void setCssReference(CSSReference cssReference)
    {
        this.cssReference = cssReference;
    }

    /**
     * Returns the name or the data contained within
     *
     * @return
     */
    @Override
    public String toString()
    {
        if (data != null && !data.isEmpty())
        {
            return data;
        }
        else
        {
            return name();
        }
    }
}