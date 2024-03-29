Prom-Monitor
===

Example setup for monitoring Docker Swarm Spring Boot services (several replicas) with Prometheus.

Idea
---

The idea to monitor Spring Boot application running as a service in a Docker Swarm stack with Prometheus.
The service can have several replicas, so we are using [promswarmconnect](https://github.com/function61/promswarmconnect) to have a custom service discovery endpoint for Prometheus.

There is a custom metric defined for the application which is then used in a custom Grafana dashboard.


Copyright disclaimer
---

Some of the code was copied and/or modified from the following sources:

- [stefanprodan/swarmprom](https://github.com/stefanprodan/swarmprom)
- [function61/prometheus-conf](https://github.com/function61/prometheus-conf)
- [function61/promswarmconnect](https://github.com/function61/promswarmconnect)
- [Monitoring cAdvisor with Prometheus](https://prometheus.io/docs/guides/cadvisor/)
- [Provisioning Grafana](https://56k.cloud/blog/provisioning-grafana-datasources-and-dashboards-automagically/)
- [Swarm Stack Monitoring Grafana dashboard](https://grafana.com/grafana/dashboards/7007)
- [Custom metrics with Micrometer](https://www.atlantbh.com/blog/custom_metrics_micrometer_prometheus_spring_boot_actuator/)
- [Custom metrics for Actuator](https://stackoverflow.com/questions/50406296/custom-metrics-for-actuator-prometheus)
- [Docker Maven plugin, Fabric8](https://dmp.fabric8.io/#simple-dockerfile-build)
- [fabric8io/fabric8-maven-plugin](https://github.com/fabric8io/fabric8-maven-plugin)