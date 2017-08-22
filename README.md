# Reporting
This project contains the code required to provide reporting functionality to a CTP SpringBoot Application.

It is the responsibility of the application to create the report tables in its own schema, and to wire the application
class in order to allow Spring to locate the report modules classes correctly.

For an example (see the CaseSvc):
    - see the CaseSvc main application class: Spring @annotations.
    - see uk.gov.ons.ctp.response.casesvc.domain.model.CaseReport.

## Copyright
Copyright (C) 2017 Crown Copyright (Office for National Statistics)
