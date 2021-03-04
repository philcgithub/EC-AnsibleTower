
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class LaunchAJobTemplateParameters {
    /**
    * Label: Job Template id, type: entry
    */
    String id

    static LaunchAJobTemplateParameters initParameters(StepParameters sp) {
        LaunchAJobTemplateParameters parameters = new LaunchAJobTemplateParameters()

        def id = sp.getRequiredParameter('id').value
        parameters.id = id

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: ca3967c8ec6b85977537338480aabe81 ===