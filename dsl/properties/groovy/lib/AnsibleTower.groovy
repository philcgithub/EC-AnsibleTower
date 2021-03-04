import com.cloudbees.flowpdf.*

/**
* AnsibleTower
*/
class AnsibleTower extends FlowPlugin {

    @Override
    Map<String, Object> pluginInfo() {
        return [
                pluginName     : '@PLUGIN_KEY@',
                pluginVersion  : '@PLUGIN_VERSION@',
                configFields   : ['config'],
                configLocations: ['ec_plugin_cfgs'],
                defaultConfigValues: [:]
        ]
    }
// === check connection ends ===
/**
     * Auto-generated method for the procedure Launch a Job Template/Launch a Job Template
     * Add your code into this method and it will be called when step runs* Parameter: config* Parameter: id
     */
    def launchAJobTemplate(StepParameters p, StepResult sr) {
        LaunchAJobTemplateParameters sp = LaunchAJobTemplateParameters.initParameters(p)
        ECAnsibleTowerRESTClient rest = genECAnsibleTowerRESTClient()
        Map restParams = [:]
        Map requestParams = p.asMap
        restParams.put('id', requestParams.get('id'))

        Object response = rest.launchJobTemplate(restParams)
        log.info "Got response from server: $response"
        //TODO step result output parameters
        sr.apply()
    }
/**
     * This method returns REST Client object
     */
    ECAnsibleTowerRESTClient genECAnsibleTowerRESTClient() {
        Context context = getContext()
        ECAnsibleTowerRESTClient rest = ECAnsibleTowerRESTClient.fromConfig(context.getConfigValues(), this)
        return rest
    }
// === step ends ===

}